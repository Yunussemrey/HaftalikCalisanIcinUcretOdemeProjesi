//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HaftalıkUcret haftalıkUcret = new HaftalıkUcret();
        //        System.out.println(haftalıkUcret.calışanlar.getPerson1());

        haftalıkUcret.setGelir(700);
        haftalıkUcret.setGider(200);
        haftalıkUcret.setBakiye(haftalıkUcret.getGelir()- haftalıkUcret.getGider());
        System.out.println("Haftalık hesap kesimleri aşağıdaki gibidir:");
        System.out.println(haftalıkUcret.calışanlar.getPerson()+ " Bu hafta alacağı para: " +haftalıkUcret.getGelir()+"TL");
        System.out.println(haftalıkUcret.calışanlar.getPerson1()+ " Bu hafta alacağı para: " +haftalıkUcret.getGelir()+"TL");
        System.out.println(haftalıkUcret.calışanlar.getPerson2()+ " Bu hafta alacağı para: " +haftalıkUcret.getGelir()+"TL");
        System.out.println(haftalıkUcret.calışanlar.getPerson3()+ " Bu hafta alacağı para: " +haftalıkUcret.getGelir()+"TL");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(haftalıkUcret.calışanlar.getPerson()+ " Bu hafta harcadığı para: "+haftalıkUcret.getGider()+"TL");
        System.out.println(haftalıkUcret.calışanlar.getPerson()+ " kalan bakiye: "+haftalıkUcret.getBakiye()+"TL");

    }
}