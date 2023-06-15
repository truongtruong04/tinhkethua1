
    public class Human extends Person{
        private String school;
        private String moto ;
        public Human(String moto , String school){
            this.school= school ;
            this.moto = moto ;
        }public Human(){

        }
        public String  getSchool(){
     return school ;
    }public void setSchool(String school){

        this.school = school;
    }public String getMoto(){

        return moto ;
    }
    public void love(){
        System.out.println("love ");
    }
    public void gameming(){
        System.out.println("chơi rắn săn mồi ");
    }
}

