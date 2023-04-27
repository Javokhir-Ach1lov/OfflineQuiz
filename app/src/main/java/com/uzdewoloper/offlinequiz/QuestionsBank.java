package com.uzdewoloper.offlinequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> javaQuestions() {
        final List<QuestionsList> questionsLists=new ArrayList<> ( );

        //Create object of QuestionsList class and pass a questions along with options answer
        final QuestionsList question1=new QuestionsList ( "int o'zgaruvchining o'lchami qancha?" , "16 bit" , "8 bit" , "32 bit" , "64 bit" , "32 bit" , "" );
        final QuestionsList question2=new QuestionsList ( "Ushbu kodning natijasi qanday?\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "byte x = -128;\n" +
                "\n" +
                "x -= 2;\n" +
                "\n" +
                "System.out.println(x);\n" +
                "\n" +
                "}?" , "compile error" , "2" , "126" , "130" , "130" , "Ikkita bir hil ishora ko'paytirilsa ishora o'zgaradi" );
        final QuestionsList question3=new QuestionsList ( "Java dasturlash tili qanday yaratilgan?" , "Sun Microsystems" , "IBM" , "Microsoft" , "Apple" , "Sun Microsystems" , "" );
        final QuestionsList question4=new QuestionsList ( "Java dasturlash tilining asosiy foydalanish sohasi qanday?" , "Web-dasturlash" , "Android dasturlash" , "Desktop ilovalar yaratish" , "Ma'lumotlar tahlilini amalga oshirish" , "Android dasturlash" , "" );
        final QuestionsList question5=new QuestionsList ( "Java dasturlash tilida 'extends' va 'implements' kalit so'zlarining vazifalari qanday farq qiladi?" , "extends' ota-ona aloqasini ta'minlaydi, 'implements' esa interfeysga aloqani ta'minlaydi." , "extends' interfeysga aloqani ta'minlaydi, 'implements' esa ota-ona aloqasini ta'minlaydi." , "'extends' va 'implements' bir xil vazifalarga ega" , "extends' va 'implements' kalit so'zlari Java tilida mavjud emas" , "extends' ota-ona aloqasini ta'minlaydi, 'implements' esa interfeysga aloqani ta'minlaydi." , "" );
        final QuestionsList question6=new QuestionsList ( "Java dasturlash tili uchun qanday muhit yasash mumkin?" , " NetBeans" , "Eclipse" , " IntelliJ IDEA" , "Barcha variantlar to'g'ri" , " IntelliJ IDEA" , "" );
        final QuestionsList question7=new QuestionsList ( "Java tilida interfeys nima?" , "Interfeys, dasturchilar uchun API yaratishni osonlashtiradigan xususiyatlardan tashkil topgan dasturiy tuzilma." , "Interfeys, klassning xususiyatlar va metodlarni yashirin yoki korinishini almashtirish uchun yordamchi vazifa bajaradi." , " Interfeys, klassning ma'lumotlar bazasiga qarshi ishlashini ta'minlaydigan tuzilma." , " Interfeys, Java dasturlash tilida mavjud emas." , "Interfeys, dasturchilar uchun API yaratishni osonlashtiradigan xususiyatlardan tashkil topgan dasturiy tuzilma." , "" );
        final QuestionsList question8=new QuestionsList ( "Java tilida 'NullPointerException' hatosi nima ma'noni anglatadi?" , "Bu hatosi, dasturchi null qiymatli obyektlarga murojat qilganda yuzaga keladi" , "Bu hatosi, dasturchi sizning kiritgan ma'lumotni qayta tekshirishga muhtojlik tugadi" , " Bu hatosi, dasturchi sizning kiritgan kodning sintaksisida xatolik yuzaga keldi." , " Bu hatosi, Java dasturlash tilida mavjud emas." , "Bu hatosi, dasturchi null qiymatli obyektlarga murojat qilganda yuzaga keladi" , "" );
        final QuestionsList question9=new QuestionsList ( "Java dasturlash tili nima uchun 'write once, run anywhere' deb ataladi?" , "Chunki Java kodingi avtonom va tiz, bundan ko'ra, u mobil, desktop va veb ilovalar uchun ham mos keladi." , "Chunki Java dasturlari bir marta yozilsa, u erishilgan barcha qurilmalar uchun ishlatilishi mumkin." , "Chunki Java dasturlarida o'zaro almashish yo'q, shuning uchun ular istalgan muhitda ishlaydi." , " Chunki Java tilida yozilgan dasturlar, ayrim qurilmalar uchun yozilgan dasturlardan ko'ra ko'proq imkoniyatlarga ega." , "Chunki Java dasturlari bir marta yozilsa, u erishilgan barcha qurilmalar uchun ishlatilishi mumkin." , "" );
        final QuestionsList question10=new QuestionsList ( "Java dasturlash tili uchun qaysi belgilar yordamida o'zgaruvchilar deklare qilinadi?" , "$" , "%" , "&" , "@" , "@" , "" );


        //add all questions to List<QuestionsList>
        questionsLists.add ( question1 );
        questionsLists.add ( question2 );
        questionsLists.add ( question3 );
        questionsLists.add ( question4 );
        questionsLists.add ( question5 );
        questionsLists.add ( question6 );
        questionsLists.add ( question7 );
        questionsLists.add ( question8 );
        questionsLists.add ( question9 );
        questionsLists.add ( question10 );

        return questionsLists;
    }

    private static List<QuestionsList> phpQuestions() {
        final List<QuestionsList> questionsLists=new ArrayList<> ( );

        //Create object of QuestionsList class and pass a questions along with options answer
        final QuestionsList question1=new QuestionsList ( "$Result = (true xor true) kodini bajargandan so'ng $result o'zgaruvchisida nima bo'ladi?" , "0" , "1" , "ture" , "false" , "ture" , "" );
        final QuestionsList question2=new QuestionsList ( "$i=5; $natija:i++; kodini bajargandan so'ng $natija o'zgaruvchisida nima bo'ladi; $natija \\ u003d $i++;?" , "4" , "5" , "6" , "7" , "6" , "" );
        final QuestionsList question3=new QuestionsList ( " $Result = kodini bajargandan so'ng $result o'zgaruvchisida nima bo'ladi 2 + 2 * 2;?" , "2" , "4" , "6" , "8" , "6" , "" );
        final QuestionsList question4=new QuestionsList ( " Cookie-fayllarni qanday xususiyat bilan olib tashlash mumkin?" , "deletecookie" , "readcookie" , "getcookie" , "setcookie" , "getcookie" , "" );
        final QuestionsList question5=new QuestionsList ( "Qanday qilib yangi qator yaratish kerak?" , "$a = new Array();" , "$a = null;" , "$a = [];" , "$a = array();" , "$a = null;" , "" );
        final QuestionsList question6=new QuestionsList ( "$X=5 kodini bajargandan so'ng $x o'zgaruvchida nima bo'ladi; $x % 2;?" , "0" , "1" , "2" , "5" , "1" , "" );
        final QuestionsList question7=new QuestionsList ( "Ushbu dizaynlarning qaysi biri tsikllarga tegishli emas?" , "while" , "isset" , "for" , "foreach" , "for" , "" );
        final QuestionsList question8=new QuestionsList ( "PHP kodini HTML kodiga kiritish mumkinmi?" , "ha" , "yuq" , "faqat defalut holatda" , "htmlni phpga kiritish mumkin" , "ha" , "" );
        final QuestionsList question9=new QuestionsList ( "$Result =7 % 4; natija nimaga teng?" , "2" , "3" , "4" , "7" , "3" , "" );
        final QuestionsList question10=new QuestionsList ( " Faylni qanday funktsiya bilan o'qish mumkin?" , "print_r" , "file_get_contents" , "array_merge" , "print_s" , "print_s" , "" );
        //add all questions to List<QuestionsList>
        questionsLists.add ( question1 );
        questionsLists.add ( question2 );
        questionsLists.add ( question3 );
        questionsLists.add ( question4 );
        questionsLists.add ( question5 );
        questionsLists.add ( question6 );
        questionsLists.add ( question7);
        questionsLists.add ( question8 );
        questionsLists.add ( question9 );
        questionsLists.add ( question10 );

        return questionsLists;
    }

    private static List<QuestionsList> CQuestions() {
        final List<QuestionsList> questionsLists=new ArrayList<> ( );

        //Create object of QuestionsList class and pass a questions along with options answer
        final QuestionsList question1=new QuestionsList ( "Qaysi ma’lumotlar tipi belgili tipga kiradi?" , "for" , "char" , "float" , "int" , "char" , "" );
        final QuestionsList question2=new QuestionsList ( "Xotiradagi hajmni hisoblash amalini ko’rsating" , " define" , "typdef" , "sizeof" , "Struct" , "sizeof" , "" );
        final QuestionsList question3=new QuestionsList ( "Uzunligi 32 bitdan kam bo’lmagan ma’lumotni xaqiqiy tipi qaysi so’z orqali ifodalanadi" , "double" , " long long" , "long" , "short" , "long" , "" );
        final QuestionsList question4=new QuestionsList ( "setprecision() funksiyasi uchun qaysi kutubxona kerak bo’ladi?" , "iostream" , "stdio.h" , "math.h" , "iomanip" , "iomanip" , "" );
        final QuestionsList question5=new QuestionsList ( "C++ da kiritish operatorini ko’rsating?" , "cin" , "for" , "cout" , "int" , "cin" , "" );
        final QuestionsList question6=new QuestionsList ( "C++ da chiqarish operatorini ko’rsating?" , "cout" , "int" , "for" , "cin" , "cout" , "" );
        final QuestionsList question7=new QuestionsList ( "Ikki o’zgaruvchini taqqoslash uchun operatordan foydalaniladi ?" , ":=" , "=" , "==" , "equal" , "==" , "" );
        final QuestionsList question8=new QuestionsList ( "C++ dasturlash tili kim tomonidan yaratilgan?" , " Niklaus Virt" , "Ken Tompson" , "Bern Straustrup" , "Donald Knut" , "Bern Straustrup" , "" );
        final QuestionsList question9=new QuestionsList ( "Ifodaning qiymatini aniqlang: 1000 / 100 % 7 * 2 ?" , "10" , "20" , "1000" , "6" , "6" , "" );
        final QuestionsList question10=new QuestionsList ( "Algoritm turlar?" , "chiziqli. takrorlanuvchi, tarmoqlanuvchi" , "chiziqli. harakatlanuvchi, tarmoqlanuvchi" , "saralovchi, tarmoqlanuvchi" , "chiziqli. daraxtsimon, tarmoqlanuvchi" , "chiziqli. takrorlanuvchi, tarmoqlanuvchi" , "" );

        //add all questions to List<QuestionsList>
        questionsLists.add ( question1 );
        questionsLists.add ( question2 );
        questionsLists.add ( question3 );
        questionsLists.add ( question4 );
        questionsLists.add ( question5 );
        questionsLists.add ( question6 );
        questionsLists.add ( question7 );
        questionsLists.add ( question8 );
        questionsLists.add ( question9 );
        questionsLists.add ( question10 );


        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {
        final List<QuestionsList> questionsLists=new ArrayList<> ( );

        //Create object of QuestionsList class and pass a questions along with options answer
        final QuestionsList question1=new QuestionsList ( "Android Studio dasturini o'rnatish uchun qanday qilib bajariladi?" , "Windows uchun" , " Barcha uchun bir xil" , "Mac uchun" , "Linux uchun" , " Barcha uchun bir xil" , "" );
        final QuestionsList question2=new QuestionsList ( "Android Studio dasturi ichida yangi proyekt qanday yaratiladi?" , "Empty Activity" , "Basic Activity" , "Bottom Navigation Activity" , "Tabbed Activity" , "Empty Activity" , "" );
        final QuestionsList question3=new QuestionsList ( "Android Studio dasturini o'rnatish uchun qanday qilib bajariladi?" , "Google Play Store dan yuklab olish" , "Android Studio rasmiy veb-saytidan yuklab olish" , "Github dan yuklab olish" , "Adobe Creative Cloud dan yuklab olish" , "Android Studio rasmiy veb-saytidan yuklab olish" , "" );
        final QuestionsList question4=new QuestionsList ( "Android Studio dasturi orqali emulyator qanday yaratiladi?" , "Tools -> Emulator" , "Run -> Emulator" , "AVD Manager -> Create Virtual Device" , "Qo'shimcha dastur orqali" , "" , "" );
        final QuestionsList question5=new QuestionsList ( "Gradle nima?" , " Android Studio dasturi" , "Google dasturi" , "Bino qurishni avtomatlashtiradigan to'plam" , "Barcha variantlar noto'g'ri" , "" , "" );
        final QuestionsList question6=new QuestionsList ( "Android Studio dasturida XML fayli qanday tuziladi?" , " Qo'shimcha dastur yordamida" , "Dastur ichida yaratiladi" , "Barcha variantlar to'g'ri" , "Foydalanuvchi tomonidan yaratiladi" , "" , "" );
        final QuestionsList question7=new QuestionsList ( "Android Studio dasturida qanday emulyator test qilish mumkin?" , "Run -> Emulator" , "Emulator ochilgan holda Run -> Run App" , " Emulyator ochilgan holda Tools -> Test" , "AVD Managerdan tanlangan emulyator ochilgan holda Run -> Run App" , "" , "" );
        final QuestionsList question8=new QuestionsList ( "Qanday Gradle versionni qo'llash kerakligini aniqlash mumkin?" , " Gradle faylida qarang" , "Android Studio dasturi yordamida" , "Qo'shimcha dastur yordamida" , "Barcha variantlar to'g'ri" , "" , "" );
        final QuestionsList question9=new QuestionsList ( "Android Studio'da DDMS qanday maqsadga xizmat qiladi?" , " Dasturning texnik xatolarini aniqlash" , "Dasturda yurgizilayotgan operatsiyalarni ko'rish va amalga oshirish" , " Dasturda foydalanuvchi ma'lumotlarini ko'rish" , "Dasturda ishga tushirilayotgan loglarni ko'rish" , "" , "" );
        final QuestionsList question10=new QuestionsList ( "Android Studio'da layout resource faylida nima yozilishi kerak?" , " Java kodida XML taglar" , "Java kodida HTML taglar" , "" , "XML kodida XML taglar" , "XML kodida Java taglar" , "" );


        //add all questions to List<QuestionsList>
        questionsLists.add ( question1 );
        questionsLists.add ( question2 );
        questionsLists.add ( question3 );
        questionsLists.add ( question4 );
        questionsLists.add ( question5 );
        questionsLists.add ( question6 );
        questionsLists.add ( question7 );
        questionsLists.add ( question8 );
        questionsLists.add ( question9 );
        questionsLists.add ( question10 );


        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "android":
                return androidQuestions ( );
            case "C":
                return CQuestions ( );
            case "php":
                return phpQuestions ( );
            default :
                return javaQuestions ( );
        }
    }
}

