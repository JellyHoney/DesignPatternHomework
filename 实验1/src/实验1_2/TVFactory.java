package 实验1_2;

public class TVFactory {
    public static TV produceTV(String brand) throws UnsupportedTVException{
        if(brand.equalsIgnoreCase("hisense")){
            return new HisenseTV();
        }
        else if(brand.equalsIgnoreCase("haier")){
            return new HaierTV();
        }
        else{
            throw new UnsupportedTVException("unsupported TV brand");
        }
    }
}
