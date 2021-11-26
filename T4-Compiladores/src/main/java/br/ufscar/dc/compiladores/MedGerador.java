package br.ufscar.dc.compiladores;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class MedGerador extends GramaticaBaseVisitor<Void> {
    public StringBuilder saida = new StringBuilder();;
    
    // Append as informacoes do header do html da receita, no buffer de saida.
    private void setHeader(){
        saida.append(" <!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "<title>Receita</title>\n" +
            "</head>\n" +
            "<body>\n");
    }
    
    // Append as informacoes de style do html da receita, no buffer de saida
    private void setStyle(){
        saida.append("<style>\n" +
            "    #anverso {\n" +
            "        width: 60%;\n" +
            "        height: 80%;\n" +
            "        margin: 50px 100px 50px 100px;\n" +
            "        border-style: double;\n" +
            "        border-color: #00ace6;\n" +
            "        border-width: 7px;\n" +
            "        border-radius: 25px;\n" +
            "        font-size: 20px;\n" +
            "        padding: 10px 20px 10px 20px;\n" +
            "    }\n" +
            "    body {\n" +
            "        color: #002266;\n" +
            "        background-color: #d9d9d9;\n" +
            "    }\n" +
            "\n" +
            "    #medico, #paciente, #remedio, #data {\n" +
            "        margin: 0 0 70px 0;\n" +
            "    }\n" +
            "    #logo{\n" +
            "        width: 50px;\n" +
            "        height:50px;\n" +
            "    }\n" +
            "\n" +
            "    hr{\n" +
            "        width: 50%;\n" +
            "        color: #002266;\n" +
            "    }\n" +
            "\n" +
            "</style>\n");
    }
    
    // Append as informacoes da imagem a ser colocada na receita.
    private void setImage(){
        saida.append("<table>\n" +
            "    <tr>\n" +
            "        <td><img id=\"logo\" src=\"medicina.png\"></td>\n" +
            "        <td><h1>RECEITUÁRIO</h1></td>\n" +
            "    </tr>\n" +
            "</table>\n");
    }
    
    // Visita o escopo da receita.
    @Override
    public Void visitReceita(GramaticaParser.ReceitaContext ctx) {
        
        // Append nas informacoes iniciais do html gerado.
        setHeader();
        setStyle();
        setImage();
        
        // Primeira vem o anverso da receita.
        saida.append("<div id=\"anverso\">\n");
        
        visitMedico(ctx.medico()); // Visita o node de medico.
        visitPaciente(ctx.paciente()); // Visita o node do paciente.
        // Visita o node do(s) remedio(s).
        ctx.remedios().remedio().forEach(rem -> visitRemedio(rem));
        
        // Insercao de data e assinatura centralizadas.
        saida.append("<center>\n");
        
        visitData(ctx.data());
        visitAssinatura(ctx.assinatura());
        
        
        saida.append("</center>\n"); // Fecha o center da data e assinatura.
        
        saida.append("</div>\n"); // Fecha o div do anverso da receita.
                
        // Inicia o verso da receita.
        saida.append("<div id=\"verso\">\n");
        
        
        saida.append("</div>\n"); // Fecha o div do verso da receita.
        
        return null;  // Nao visita os filhos.
    }
    
    // Visita o node de medico.
    @Override
    public Void visitMedico(GramaticaParser.MedicoContext ctx){
        // 
        saida.append("    <div id=\"medico\">\n");
        
        // Insere as informacoes do medico na receita.
        // nomeMedico
        saida.append("        <div class=\"campo\">"+ ctx.nomeMedico().CADEIA().getText().replace("\"", "") +"</div>\n");
        // ruaMedico, numeroMedico, bairroMedico.        
        saida.append("        <div class=\"campo\">"+ ctx.ruaMedico().CADEIA().getText().replace("\"", "")+ " "+ ctx.numeroMedico().NUM_INT().getText()+ ", " + ctx.bairroMedico().CADEIA().getText().replace("\"", "") + "</div>\n");
        // cidadeMedico, estadoMedico.
        saida.append("        <div class=\"campo\">" + ctx.cidadeMedico().CADEIA().getText().replace("\"", "") + ", " + ctx.estadoMedico().CADEIA().getText().replace("\"", "") + "</div>\n");
        // telefoneMedico
        saida.append("        <div class=\"campo\">Telefone " + ctx.telefoneMedico().CADEIA().getText().replace("\"", "") + "</div>\n");
        // crmMedico
        saida.append("        <div class=\"campo\">CRM PB " + ctx.crmMedico().NUM_INT().getText() + "</div>\n");
        
        saida.append("    </div>\n");
        return null; // Nao visita os filhos.
    }
    
    // Visita o node do paciente.
    @Override
    public Void visitPaciente(GramaticaParser.PacienteContext ctx){
         
        saida.append("    <div id=\"paciente\">\n");
        
        // Insere as informacoes do paciente na receita.
        // nomePaciente.
        saida.append("        <div class=\"campo\">"+ ctx.nomePaciente().CADEIA().getText().replace("\"", "")+"</div>\n");
        // ruaPaciente, numeroPaciente.
        saida.append("        <div class=\"campo\">"+ ctx.ruaPaciente().CADEIA().getText().replace("\"", "") +", "+ ctx.numeroPaciente().NUM_INT().getText() +"</div>\n");
        // cidadePaciente, estadoPaciente.
        saida.append("        <div class=\"campo\">"+ ctx.cidadePaciente().CADEIA().getText().replace("\"", "")+", " + ctx.estadoPaciente().CADEIA().getText().replace("\"", "") + "</div>\n");
        
        saida.append("    </div>\n");
        
        return null; // Nao visita os filhos.
    }
    
    @Override
    public Void visitRemedio(GramaticaParser.RemedioContext ctx){
        
        saida.append("    <div id=\"remedio\">\n");
        
        // Insere as informações do remedio na receita.
        // nomeRemedio, dosagemRemedio, numeroComprimidos, numeroCaixas
        saida.append("        <div class=\"campo\">"+ctx.nomeRemedio().CADEIA().getText().replace("\"", "") +" "+ ctx.dosagem().CADEIA().getText().replace("\"", "")+", "+ ctx.numeroComprimidos().NUM_INT().getText() + " comprimido(s) "+ ctx.numeroCaixas().NUM_INT().getText() + " caixa(s) " +"</div>\n");
        // prescricaoQtde, prescricaoHoras, prescricaoDias. 
        saida.append("        <div class=\"campo\">" +ctx.prescricaoQtde().NUM_INT().getText()+" comprimido(s) de " + ctx.prescricaoHoras().NUM_INT().getText() +" em "+ ctx.prescricaoHoras().NUM_INT().getText() +"  hora(s) por "+ ctx.prescricaoDias().NUM_INT().getText() + " dia(s)</div>\n");

        saida.append("    </div>\n");
        return null;
    }
    
    @Override
    public Void visitData(GramaticaParser.DataContext ctx){
        
        saida.append("        <div id=\"data\">\n");
        if(ctx == null){
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
            LocalDateTime agora = LocalDateTime.now();  
            saida.append("            " + data.format(agora));
        }
        else
            saida.append("            " + ctx.CADEIA().getText().replace("\"", "") + "\n");
        saida.append("            </div>\n"); 
        return null;
    }
 
    @Override
    public Void visitAssinatura(GramaticaParser.AssinaturaContext ctx){
        
        // Inserindo o caminho da imagem da assinatura do medico.
        saida.append("        <img id=\"assinatura\" src=\""+ ctx.CADEIA().getText().replace("\"", "")+"\"\\>\n");
        saida.append("        <hr/>\n");
        
        saida.append("        <div id=\"assinatura\">\n" +
            "            Assinatura do profissional\n" +
            "        </div>\n");
        return null;
    }
        
}