/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author SURAJ
 */
class A{
            int a,b,c;
           A(int a,int b){
                    this.a=a;
                    this.b=b;
                   
            }
            void add()
            {
                
                c=a+b;
            }
            public void display()
            {
                System.out.println("SUM "+c);
            }
            
        }
class B extends A{
    
    B(int a,int b)
    {
        super(a, b);
        
    }
    
    @Override
    void add(){
        super.add();
    }
    
    
}
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            B obj= new B(100,200);
            obj.add();
            obj.display();
                    
            
    }
    
}
