package tip;

public class ChuanHoaDuLieu {

    public String ChuanHoa(String input){
        String result = "";
        input = input.toLowerCase();
        String[] arr = input.split(" ");
        for (String list: arr){
            if (!list.equals("") && !list.equals(null)){
                result += String.valueOf(list.charAt(0)).toUpperCase() + list.substring(1) + " ";
            }
        }
        if (!result.equals("") && result.equals(null)){
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        ChuanHoaDuLieu chuanHoaDuLieu = new ChuanHoaDuLieu();
        System.out.println(chuanHoaDuLieu.ChuanHoa("dO    HuU Hung"));
    }
}
