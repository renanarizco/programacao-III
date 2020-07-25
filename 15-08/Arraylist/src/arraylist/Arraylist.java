/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.HashMap;



/**
 *
 * @author UNIFAFIBE
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String text = "[{\"name\":\"Angola\",\"topLevelDomain\":[\".ao\"],\"alpha2Code\":\"AO\",\"alpha3Code\":\"AGO\",\"callingCodes\":[\"244\"],\"capital\":\"Luanda\",\"altSpellings\":[\"AO\",\"República de Angola\",\"ʁɛpublika de an'ɡɔla\"],\"region\":\"Africa\",\"subregion\":\"Middle Africa\",\"population\":25868000,\"latlng\":[-12.5,18.5],\"demonym\":\"Angolan\",\"area\":1246700.0,\"gini\":58.6,\"timezones\":[\"UTC+01:00\"],\"borders\":[\"COG\",\"COD\",\"ZMB\",\"NAM\"],\"nativeName\":\"Angola\",\"numericCode\":\"024\",\"currencies\":[{\"code\":\"AOA\",\"name\":\"Angolan kwanza\",\"symbol\":\"Kz\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Angola\",\"es\":\"Angola\",\"fr\":\"Angola\",\"ja\":\"アンゴラ\",\"it\":\"Angola\",\"br\":\"Angola\",\"pt\":\"Angola\",\"nl\":\"Angola\",\"hr\":\"Angola\",\"fa\":\"آنگولا\"},\"flag\":\"https://restcountries.eu/data/ago.svg\",\"regionalBlocs\":[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],\"otherNames\":[\"الاتحاد الأفريقي\",\"Union africaine\",\"União Africana\",\"Unión Africana\",\"Umoja wa Afrika\"]}],\"cioc\":\"ANG\"},{\"name\":\"Brazil\",\"topLevelDomain\":[\".br\"],\"alpha2Code\":\"BR\",\"alpha3Code\":\"BRA\",\"callingCodes\":[\"55\"],\"capital\":\"Brasília\",\"altSpellings\":[\"BR\",\"Brasil\",\"Federative Republic of Brazil\",\"República Federativa do Brasil\"],\"region\":\"Americas\",\"subregion\":\"South America\",\"population\":206135893,\"latlng\":[-10.0,-55.0],\"demonym\":\"Brazilian\",\"area\":8515767.0,\"gini\":54.7,\"timezones\":[\"UTC-05:00\",\"UTC-04:00\",\"UTC-03:00\",\"UTC-02:00\"],\"borders\":[\"ARG\",\"BOL\",\"COL\",\"GUF\",\"GUY\",\"PRY\",\"PER\",\"SUR\",\"URY\",\"VEN\"],\"nativeName\":\"Brasil\",\"numericCode\":\"076\",\"currencies\":[{\"code\":\"BRL\",\"name\":\"Brazilian real\",\"symbol\":\"R$\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Brasilien\",\"es\":\"Brasil\",\"fr\":\"Brésil\",\"ja\":\"ブラジル\",\"it\":\"Brasile\",\"br\":\"Brasil\",\"pt\":\"Brasil\",\"nl\":\"Brazilië\",\"hr\":\"Brazil\",\"fa\":\"برزیل\"},\"flag\":\"https://restcountries.eu/data/bra.svg\",\"regionalBlocs\":[{\"acronym\":\"USAN\",\"name\":\"Union of South American Nations\",\"otherAcronyms\":[\"UNASUR\",\"UNASUL\",\"UZAN\"],\"otherNames\":[\"Unión de Naciones Suramericanas\",\"União de Nações Sul-Americanas\",\"Unie van Zuid-Amerikaanse Naties\",\"South American Union\"]}],\"cioc\":\"BRA\"},{\"name\":\"Cabo Verde\",\"topLevelDomain\":[\".cv\"],\"alpha2Code\":\"CV\",\"alpha3Code\":\"CPV\",\"callingCodes\":[\"238\"],\"capital\":\"Praia\",\"altSpellings\":[\"CV\",\"Republic of Cabo Verde\",\"República de Cabo Verde\"],\"region\":\"Africa\",\"subregion\":\"Western Africa\",\"population\":531239,\"latlng\":[16.0,-24.0],\"demonym\":\"Cape Verdian\",\"area\":4033.0,\"gini\":50.5,\"timezones\":[\"UTC-01:00\"],\"borders\":[],\"nativeName\":\"Cabo Verde\",\"numericCode\":\"132\",\"currencies\":[{\"code\":\"CVE\",\"name\":\"Cape Verdean escudo\",\"symbol\":\"Esc\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Kap Verde\",\"es\":\"Cabo Verde\",\"fr\":\"Cap Vert\",\"ja\":\"カーボベルデ\",\"it\":\"Capo Verde\",\"br\":\"Cabo Verde\",\"pt\":\"Cabo Verde\",\"nl\":\"Kaapverdië\",\"hr\":\"Zelenortska Republika\",\"fa\":\"کیپ ورد\"},\"flag\":\"https://restcountries.eu/data/cpv.svg\",\"regionalBlocs\":[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],\"otherNames\":[\"الاتحاد الأفريقي\",\"Union africaine\",\"União Africana\",\"Unión Africana\",\"Umoja wa Afrika\"]}],\"cioc\":\"CPV\"},{\"name\":\"Guinea-Bissau\",\"topLevelDomain\":[\".gw\"],\"alpha2Code\":\"GW\",\"alpha3Code\":\"GNB\",\"callingCodes\":[\"245\"],\"capital\":\"Bissau\",\"altSpellings\":[\"GW\",\"Republic of Guinea-Bissau\",\"República da Guiné-Bissau\"],\"region\":\"Africa\",\"subregion\":\"Western Africa\",\"population\":1547777,\"latlng\":[12.0,-15.0],\"demonym\":\"Guinea-Bissauan\",\"area\":36125.0,\"gini\":35.5,\"timezones\":[\"UTC\"],\"borders\":[\"GIN\",\"SEN\"],\"nativeName\":\"Guiné-Bissau\",\"numericCode\":\"624\",\"currencies\":[{\"code\":\"XOF\",\"name\":\"West African CFA franc\",\"symbol\":\"Fr\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Guinea-Bissau\",\"es\":\"Guinea-Bisáu\",\"fr\":\"Guinée-Bissau\",\"ja\":\"ギニアビサウ\",\"it\":\"Guinea-Bissau\",\"br\":\"Guiné-Bissau\",\"pt\":\"Guiné-Bissau\",\"nl\":\"Guinee-Bissau\",\"hr\":\"Gvineja Bisau\",\"fa\":\"گینه بیسائو\"},\"flag\":\"https://restcountries.eu/data/gnb.svg\",\"regionalBlocs\":[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],\"otherNames\":[\"الاتحاد الأفريقي\",\"Union africaine\",\"União Africana\",\"Unión Africana\",\"Umoja wa Afrika\"]}],\"cioc\":\"GBS\"},{\"name\":\"Macao\",\"topLevelDomain\":[\".mo\"],\"alpha2Code\":\"MO\",\"alpha3Code\":\"MAC\",\"callingCodes\":[\"853\"],\"capital\":\"\",\"altSpellings\":[\"MO\",\"澳门\",\"Macao Special Administrative Region of the People's Republic of China\",\"中華人民共和國澳門特別行政區\",\"Região Administrativa Especial de Macau da República Popular da China\"],\"region\":\"Asia\",\"subregion\":\"Eastern Asia\",\"population\":649100,\"latlng\":[22.16666666,113.55],\"demonym\":\"Chinese\",\"area\":30.0,\"gini\":null,\"timezones\":[\"UTC+08:00\"],\"borders\":[\"CHN\"],\"nativeName\":\"澳門\",\"numericCode\":\"446\",\"currencies\":[{\"code\":\"MOP\",\"name\":\"Macanese pataca\",\"symbol\":\"P\"}],\"languages\":[{\"iso639_1\":\"zh\",\"iso639_2\":\"zho\",\"name\":\"Chinese\",\"nativeName\":\"中文 (Zhōngwén)\"},{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Macao\",\"es\":\"Macao\",\"fr\":\"Macao\",\"ja\":\"マカオ\",\"it\":\"Macao\",\"br\":\"Macau\",\"pt\":\"Macau\",\"nl\":\"Macao\",\"hr\":\"Makao\",\"fa\":\"مکائو\"},\"flag\":\"https://restcountries.eu/data/mac.svg\",\"regionalBlocs\":[],\"cioc\":\"\"},{\"name\":\"Mozambique\",\"topLevelDomain\":[\".mz\"],\"alpha2Code\":\"MZ\",\"alpha3Code\":\"MOZ\",\"callingCodes\":[\"258\"],\"capital\":\"Maputo\",\"altSpellings\":[\"MZ\",\"Republic of Mozambique\",\"República de Moçambique\"],\"region\":\"Africa\",\"subregion\":\"Eastern Africa\",\"population\":26423700,\"latlng\":[-18.25,35.0],\"demonym\":\"Mozambican\",\"area\":801590.0,\"gini\":45.7,\"timezones\":[\"UTC+02:00\"],\"borders\":[\"MWI\",\"ZAF\",\"SWZ\",\"TZA\",\"ZMB\",\"ZWE\"],\"nativeName\":\"Moçambique\",\"numericCode\":\"508\",\"currencies\":[{\"code\":\"MZN\",\"name\":\"Mozambican metical\",\"symbol\":\"MT\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Mosambik\",\"es\":\"Mozambique\",\"fr\":\"Mozambique\",\"ja\":\"モザンビーク\",\"it\":\"Mozambico\",\"br\":\"Moçambique\",\"pt\":\"Moçambique\",\"nl\":\"Mozambique\",\"hr\":\"Mozambik\",\"fa\":\"موزامبیک\"},\"flag\":\"https://restcountries.eu/data/moz.svg\",\"regionalBlocs\":[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],\"otherNames\":[\"الاتحاد الأفريقي\",\"Union africaine\",\"União Africana\",\"Unión Africana\",\"Umoja wa Afrika\"]}],\"cioc\":\"MOZ\"},{\"name\":\"Portugal\",\"topLevelDomain\":[\".pt\"],\"alpha2Code\":\"PT\",\"alpha3Code\":\"PRT\",\"callingCodes\":[\"351\"],\"capital\":\"Lisbon\",\"altSpellings\":[\"PT\",\"Portuguesa\",\"Portuguese Republic\",\"República Portuguesa\"],\"region\":\"Europe\",\"subregion\":\"Southern Europe\",\"population\":10374822,\"latlng\":[39.5,-8.0],\"demonym\":\"Portuguese\",\"area\":92090.0,\"gini\":38.5,\"timezones\":[\"UTC-01:00\",\"UTC\"],\"borders\":[\"ESP\"],\"nativeName\":\"Portugal\",\"numericCode\":\"620\",\"currencies\":[{\"code\":\"EUR\",\"name\":\"Euro\",\"symbol\":\"€\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Portugal\",\"es\":\"Portugal\",\"fr\":\"Portugal\",\"ja\":\"ポルトガル\",\"it\":\"Portogallo\",\"br\":\"Portugal\",\"pt\":\"Portugal\",\"nl\":\"Portugal\",\"hr\":\"Portugal\",\"fa\":\"پرتغال\"},\"flag\":\"https://restcountries.eu/data/prt.svg\",\"regionalBlocs\":[{\"acronym\":\"EU\",\"name\":\"European Union\",\"otherAcronyms\":[],\"otherNames\":[]}],\"cioc\":\"POR\"},{\"name\":\"Sao Tome and Principe\",\"topLevelDomain\":[\".st\"],\"alpha2Code\":\"ST\",\"alpha3Code\":\"STP\",\"callingCodes\":[\"239\"],\"capital\":\"São Tomé\",\"altSpellings\":[\"ST\",\"Democratic Republic of São Tomé and Príncipe\",\"República Democrática de São Tomé e Príncipe\"],\"region\":\"Africa\",\"subregion\":\"Middle Africa\",\"population\":187356,\"latlng\":[1.0,7.0],\"demonym\":\"Sao Tomean\",\"area\":964.0,\"gini\":50.8,\"timezones\":[\"UTC\"],\"borders\":[],\"nativeName\":\"São Tomé e Príncipe\",\"numericCode\":\"678\",\"currencies\":[{\"code\":\"STD\",\"name\":\"São Tomé and Príncipe dobra\",\"symbol\":\"Db\"}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"São Tomé und Príncipe\",\"es\":\"Santo Tomé y Príncipe\",\"fr\":\"Sao Tomé-et-Principe\",\"ja\":\"サントメ・プリンシペ\",\"it\":\"São Tomé e Príncipe\",\"br\":\"São Tomé e Príncipe\",\"pt\":\"São Tomé e Príncipe\",\"nl\":\"Sao Tomé en Principe\",\"hr\":\"Sveti Toma i Princip\",\"fa\":\"کواترو دو فرویرو\"},\"flag\":\"https://restcountries.eu/data/stp.svg\",\"regionalBlocs\":[{\"acronym\":\"AU\",\"name\":\"African Union\",\"otherAcronyms\":[],\"otherNames\":[\"الاتحاد الأفريقي\",\"Union africaine\",\"União Africana\",\"Unión Africana\",\"Umoja wa Afrika\"]}],\"cioc\":\"STP\"},{\"name\":\"Timor-Leste\",\"topLevelDomain\":[\".tl\"],\"alpha2Code\":\"TL\",\"alpha3Code\":\"TLS\",\"callingCodes\":[\"670\"],\"capital\":\"Dili\",\"altSpellings\":[\"TL\",\"East Timor\",\"Democratic Republic of Timor-Leste\",\"República Democrática de Timor-Leste\",\"Repúblika Demokrátika Timór-Leste\"],\"region\":\"Asia\",\"subregion\":\"South-Eastern Asia\",\"population\":1167242,\"latlng\":[-8.83333333,125.91666666],\"demonym\":\"East Timorese\",\"area\":14874.0,\"gini\":31.9,\"timezones\":[\"UTC+09:00\"],\"borders\":[\"IDN\"],\"nativeName\":\"Timor-Leste\",\"numericCode\":\"626\",\"currencies\":[{\"code\":\"USD\",\"name\":\"United States dollar\",\"symbol\":\"$\"},{\"code\":null,\"name\":null,\"symbol\":null}],\"languages\":[{\"iso639_1\":\"pt\",\"iso639_2\":\"por\",\"name\":\"Portuguese\",\"nativeName\":\"Português\"}],\"translations\":{\"de\":\"Timor-Leste\",\"es\":\"Timor Oriental\",\"fr\":\"Timor oriental\",\"ja\":\"東ティモール\",\"it\":\"Timor Est\",\"br\":\"Timor Leste\",\"pt\":\"Timor Leste\",\"nl\":\"Oost-Timor\",\"hr\":\"Istočni Timor\",\"fa\":\"تیمور شرقی\"},\"flag\":\"https://restcountries.eu/data/tls.svg\",\"regionalBlocs\":[],\"cioc\":\"TLS\"}]";
        
        Pais pais1 = new Pais();
        
        ArrayList<Pais> lp = new ArrayList<>();
        
        while (true)
        {
            int indicenome = text.indexOf("\"name\":");
            int fimindicenome = text.indexOf(",");
            
             if (indicenome == -1){
                break;
            }
             
            String nome = text.substring(indicenome, indicenome+50);
            
            System.out.println(text.substring(indicenome, fimindicenome));
            
            /*text = text.substring(p+5);
            
            Pais ps = new Pais();
            ps.setNome(nome);
            
            lp.add(ps); */
        }
        
        
        
       
        //ArrayList<String> list = new ArrayList();
        //lp.add(e);
        
        //HashMap<String,Arraylist<Pais>> dic = new HashMap<>();
        
        //HashMap<String,Integer> dic = new HashMap<>();
        //dic.put("Omar", 124124);
        //dic.put("Mary", 444424);
        
   
        //System.out.println("List size=" +list.size());
        //ystem.out.println(list.get(0));
        
        
    }
    
}
