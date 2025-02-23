public class SonesTwoCharacter
{
    public static void main(String[] args)
    {
        SonesMyCharacter OC1 = new SonesMyCharacter();

        OC1.setHair("pink");
        OC1.setSkin("lavender");
        OC1.setName("Eve");

        SonesMyCharacter OC2 = new SonesMyCharacter();
        OC2.setHair("white");
        OC2.setSkin("coffee");
        OC2.setName("Lee");

        characterCards(OC1);
        characterCards(OC2);

    }

    public static void characterCards(SonesMyCharacter OC)
   {
     System.out.print(OC.getName()+ " has " + OC.getHair()+" hair and "+OC.getSkin()+" skin tone. ");
   }
}
