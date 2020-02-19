package java2;
class a {
    void print(){
        System.out.println("HelloWorld");
    }
}
class Q3_NoClassDefFoundError {

    public static void main(String[] args) {
        a obj = new a();
        try{
            obj.print();
        }
        catch (Exception e){
            System.out.println(e+" class not found");
        }
    }
}
