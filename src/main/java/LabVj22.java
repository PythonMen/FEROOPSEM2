public class LabVj22 {

    public static int[] DateCheck (int year, int month, int day){

        int[] returned = new int[3];

        if (day > 31 && month%2!=0 && month < 8) day = 31;
        if (day > 31 && month%2==0 && month >= 8) day = 31;
        if (day > 28 && month==2){
            if ((year%4==0 && year%100!=0) || (year%100==0 && year%400==0)) day = 29;
            else day=28;
        }
        else if (day > 30 && month%2==0 && month < 8) day = 30;
        else if (day > 30 && month%2!=0 && month >= 8) day = 30;

        if (day<=0) day = 1;

        if (month > 12) month = 12;
        if (month <= 0) month = 1;

        returned[0] = year;
        returned[1] = month;
        returned[2] = day;

        return returned;
    }

    static class Task {
        private String text;
        int numOfTags=0;

        public Task(String text){
            this.text = text + " ";
        }

        public String toString(){
            return this.text;
        }

        public void add (TaskTag tag){
            if (numOfTags <= 10) {
                this.text += tag + " ";
                numOfTags++;
            }
        }
    }

    static class TaskTag{
        private String name;

        public TaskTag(){
            this.name="";
        }

        public TaskTag(String name){
            this.name = "@"+name;
        }

        public TaskTag(String name, int priority){
            this.name = "@" + name + "(" + priority + ")";
        }

        public TaskTag(String name, String parameter){
            this.name = "@" + name + "(" + parameter + ")";
        }

        public TaskTag(String name, int year, int month, int day){
            this.name = "@"+name+"("+year+"-"+month+"-"+day+")";
        }

        public String toString(){
            return this.name;
        }
    }

    static class PriorityTag extends TaskTag {
        int priority;

        public PriorityTag(String name, int priority){
            super(name,priority);
        }
    }

    static class DateTag extends TaskTag{
        private int year, month, day;
        String name;

        public DateTag(String name, int year, int month, int day){
            super(name, DateCheck(year, month, day)[0], DateCheck(year, month, day)[1], DateCheck(year, month, day)[2]);
        }
    }

    static class ParameterTag extends TaskTag{
        String parameter;

        public ParameterTag(String name, String parameter){
            super(name,parameter);

        }
    }

    public static void main(String[] args){
        Task task = new Task("Some task");
        System.out.println(task);
        task.add(new TaskTag("todo"));
        System.out.println(task);
        task.add(new PriorityTag("priority",3));
        System.out.println(task);
        task.add(new ParameterTag("repeat", "weekly"));
        System.out.println(task);
        task.add(new DateTag("due", 2100, 2, 31));
        System.out.println(task);
        task.add(new DateTag("start", 2021, 2, 49));
        System.out.println(task);
    }
}
