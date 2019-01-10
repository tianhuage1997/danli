package cn.zzk.demo;
//
//public class TaskManager {
//    private static TaskManager tm;
//
//    //把构造函数私有化，防止在外类创建对象
//    private TaskManager(){
//
//    }
//
//    public   static TaskManager getSingleton(){
//        if(tm==null){
//            tm=new TaskManager();
//
//        }
//        return tm;
//    }
//
//}



public class TaskManager{
      private static  TaskManager   tm  =new TaskManager();;

      //把构造函数私有化，防止在外类创建对象
     private TaskManager(){

        }

     public static  TaskManager  getSinglenton(){
         return tm;
     }

}
