package easy.tuto.myquizapplication;

public class QuestionAnswer {

    public static String question[] ={
            "Hangi tür kitapları okursun?",
            "Hangi tür filmler izlersin?",
            "Hangi tür sporları seversin",
            "Hangi tür müzikler dinlersin",
            "Haftada kaç gün spor yaparsın"
            ,"En sevdiğin şehir"
    };

    public static String choices[][] = {
            {"roman","tarih","kişisel gelişim","diğer"},
            {"dram","aksiyon","komedi","diğer"},
            {"futbol","basketbol ","voleybol","diğer"},
            {"arabesk","pop ","rap","rock"},
            {"1,3 gün","4,5 gün","6,7gün","hiç"},
            {"ankara","istanbul ","izmir","eskişehir"}
    };

    public static String correctAnswers[] = {
            "roman",
            "dram",
            "futbol",
            "1,3 gün",
            "arabesk"
    };

}
