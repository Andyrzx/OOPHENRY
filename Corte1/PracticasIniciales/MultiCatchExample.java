package multicatchexample;
public class MultiCatchExample {
    public static void main(String[] args) {
        try{
            String str = "loscalvossongays";
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            System.err.println("Error: Null pointer encountered.");
        } catch (Exception e) {
            System.err.println("Error: An unexpected exception ocurred.");
        
        }
        
    }
    
}
