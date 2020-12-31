package com.qhit.parking.Single;

/**
 * Created by Administrator on 20/03/20.
 */
  class Single {
     private Single(){}
         private static Single s=new Single();
            public static  Single getInstance() {
                return s;
            }
     }

     class Single2{
      private Single2(){}
      private  static  Single2 s=null;
      public  static Single2 getInstance(){
          if(s==null)
              s=new Single2();
          return s;
      }

     }



