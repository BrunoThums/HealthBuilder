package util;

import java.sql.Time;
import java.text.*;
import java.sql.Date;
import java.util.Locale;
import javax.swing.*;
import javax.swing.text.*;

public class Formatacao {

    static DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static JFormattedTextField getFormatado(String formato) {
        JFormattedTextField campoFormatado = null;
        MaskFormatter format = new MaskFormatter();

        format.setPlaceholderCharacter(' ');
        format.setValueContainsLiteralCharacters(false);

        try {
            format.setMask(formato);
            campoFormatado = new JFormattedTextField(format);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return campoFormatado;
    }

    public static void formatarDecimal(JTextField campo) {
        campo.setText(df.format(Double.parseDouble(campo.getText())));
    }

    public static String formatarDecimal(double valor) {
        NumberFormat formatter = new DecimalFormat("###0.00");
        return (formatter.format(valor));
    }

    public static JFormattedTextField getTelefone() {
        return getFormatado("(##) ####-####");
    }

    public static JFormattedTextField getCNPJ() {
        return getFormatado("##.###.###/####-##");
    }

    public static JFormattedTextField getCPF() {
        return getFormatado("###.###.###-##");
    }

    public static JFormattedTextField getHora() {
        return getFormatado("##:##");
    }

    public static JFormattedTextField getData() {
        return getFormatado("##/##/####");
    }

    public static JFormattedTextField getDataHora() {
        return getFormatado("##/##/#### ##:##");
    }

    public void formatoDecimal(JTextField campo) {
        campo.setText(df.format(Double.parseDouble(campo.getText())));
    }

    public static void formatarData(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##/##/####");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (ParseException e) {
            System.err.println(e);
        }
    }

    public static void formatarHora(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##:##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatarCpf(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("###.###.###-##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatarCnpj(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("##.###.###/####-##");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void formatarTelefone(JFormattedTextField campo) {
        try {
            MaskFormatter m = new MaskFormatter();
            m.setPlaceholderCharacter(' ');
            m.setMask("(##)####-####");
            campo.setFormatterFactory(null);
            campo.setFormatterFactory(new DefaultFormatterFactory(m));
            campo.setValue(null);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    /*public static String ajustaDataDMA(String data) {
        String dataFormatada = null;
        try {
            Date dataAMD = new SimpleDateFormat("yyyy-MM-dd").parse(data);
            dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(dataAMD);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (dataFormatada);
    }*/

    public static Date parseDMADate(String s) {
        if (s == null) {
            return null;
        }
        final String[] date = s.split("/");
        return Date.valueOf(String.format("%s-%s-%s", date[2], date[1], date[0]));
    }

    public static String formatDate(Date date) {
        if (date == null) {
            return null;
        }
        final String[] str = date.toString().split("-");
        return String.format("%s/%s/%s", str[2], str[1], str[0]);
    }

    public static String formatString(String date) {
        if (date == null) {
            return null;
        }
        final String[] str = date.split("-");
        return String.format("%s/%s/%s", str[2], str[1], str[0]);
    }
    /*public static String ajustaDataAMD(String data) {
        String dataFormatada = null;
        try {
            Date dataDMA = new SimpleDateFormat("dd/MM/yyyy").parse(data);
            dataFormatada = new SimpleDateFormat("yyyy-MM-dd").format(dataDMA);
        } catch (Exception e) {
            System.err.println(e);
        }
        return (dataFormatada);
    }*/

    public static String removerFormatacao(String dado) {
        String retorno = "";
        for (int i = 0; i < dado.length(); i++) {
            if (dado.charAt(i) != '.' && dado.charAt(i) != '/' && dado.charAt(i) != '-') {
                retorno = retorno + dado.charAt(i);
            }
        }
        return (retorno);
    }

    /*public static String getDataAtual() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dataHoje = df.format(now);

        return dataHoje;
    }

    public static String getDataHoraAtual() {
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        String dataHoje = df.format(now);

        return dataHoje;
    }*/

    public static Time converteHora(JComboBox hora, JComboBox min) {
        String h = (String) hora.getSelectedItem();
        String m = (String) min.getSelectedItem();

        return Time.valueOf(String.format("%s:%s:00", h, m));
    }
}
