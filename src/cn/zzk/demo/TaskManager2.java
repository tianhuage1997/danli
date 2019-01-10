package cn.zzk.demo;

////单例模式：懒汉式
//public class TaskManager2 {
//    //变量是静态变量，并且是私有的。防止外类把它给污染
//    private static TaskManager2   tm;
//
//    /*
//    对象创建的特征：构造函数被创建，
//    代表这个类被创建出来，并开辟一个内存空间的
//    构造函数被私有化。
//    //父子类之间是一个继承的关系，
//     */
//    private  TaskManager2(){
//
//    }
//
//    /*
//    懒汉式的特征，对象要用的时候才被初始化
//     */
//    public static  TaskManager2 getSingelen(){
//        if(tm==null){
//            tm=new TaskManager2();
//        }
//        return tm;
//
//    }
//}

//饿汉式单例模式
public class TaskManager2 {
    //一旦我一拿到对象，马上创建并初始化
    private static  TaskManager2 tm=new TaskManager2();
//构造方法私有化，防止外类把它给污染
    private  TaskManager2(){

    }
    public static  TaskManager2  getSingleton(){
        System.out.println(111);
        System.out.println(111);
        return tm;
    }
}
