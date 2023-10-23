import java.util.ArrayList;
public class problema3 {
    public static void main(String []args)
    {
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        ArrayList<String> c = new ArrayList<>();

        a.add("java");
        a.add("test");
        a.add("university");
        b.add("car");
        b.add("university");
        b.add("plane");
        for(int i=0;i<3;i++){
            String str = a.get(i);

            for(int y=0;y<3;y++){
                String str_doi = b.get(y);
                if(str.equals(str_doi)){
                    c.add(str_doi);

                }

            }
        }
        System.out.println(c);
    }
}
