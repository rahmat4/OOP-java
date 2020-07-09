package belajar4;

interface clickTable{
    void onClick();
}

public class button{
    private clickTable action;

    void setClickAction(clickTable action){
        this.action = action;
    }
    void doClick(){
        action.onClick();
    }
}

public class Main {
    // membuat variable di dalam class
    static String title = "Tutorial Anonymous class";
    public static void main(String[] args) {
        // jika kita menggunakan anonymous objek
        // maka kita harus bikin instance baru dari anonymous class
        clickTable clickAction = new clickTable(){
            // kode implementasi di sini
            @Override
            public void onClick() {
                // TODO Auto-generated method stub
                
            }
        };

        // baru setelah itu di pakai menjadi parameter
        btn.setClickAction(clickAction);

        // tapi jika menggunakan anonymous objek
        // kita tak perlu bikin objek baru,
        // langsung saja tulis seperti ini
        btn.setClickAction(new clickTable(){
        
            @Override
            public void onClick() {
                // TODO Auto-generated method stub
                
            }
        });

        String name = "Rahmat Pratama";
        button btn = new button();
        
        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(new clickTable(){
            // membuat variable di dalam class anonymous
            String message = "belajar Anonymous class java";

            @Override
            public void onClick(){
                System.out.println("tombol sudah di click");
                System.out.println("yay!");
                // mengakses variable
                System.out.println("Hello " + name);
                System.out.println(title);
                System.out.println(message);
            }
        });

        btn.doClick();
    }
}