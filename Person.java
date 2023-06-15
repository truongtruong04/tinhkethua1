public class Person {
        private String name ;
        private int yearold ;
        public Person(String name , int yearold){
            this.name = name;
            this.yearold = yearold ;

        }

        public Person() {
        }

        public String getName(){
            return name ;
        }public void setName(String name ){
            this.name = name ;
        }public int getYearold(){
            return yearold ;
        }public void setYearold(int  yearold ){
            this.yearold = yearold ;

        }public void run() {
            System.out.println("12km");
        }public void sleep(){
            System.out.println("7 tiếng");

        }
    }




