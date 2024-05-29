public class DempNestedLoop {
    public static void main(String[] args) {
        
    for(int i=0 ; i<4 ;i++){//0,1,2,3
        for (int j=0;j<2;j++){//0,1
            System.out.println("hello,"+"i="+i+",j="+j);
        }
    }
//1
    for(int i=0; i<4 ; i++) {
        for (int j=0;j<2;j++)
            if(i%2!=0 && j %2 ==0)    
    System.out.println("i="+i+",j="+j);}


//2
for(int i=0; i<4 ; i++){
    if(i%2 ==0)
    continue;

    for (int j=0;j<2;j++){
        if(j%2!=0)
        continue;

System.out.println("i2="+i+",j2="+j);
    }
}

    //task
    //1-20
    //1,3,5,7,9
    //12,14,16,18,20

    for (int i=0 ; i<21 ; i++){
        if(i<10 && i%2 !=0 || i>10 &&i<=20 && i%2==0)
        System.out.println("i==="+i);
    }


    for (int i=0 ; i<21 ; i++){
        if (i<10 && i%2 ==0){
            continue;
        }
        if (i>10 && i<21 && i%2 !=0){
            continue;
        }
        System.out.println("i555+" + i);
    }


    //searching
    //Find the index of first character 'a'
    //14



    String s = "Vincent Book Game Laptop";
    for(int i=0 ; i<s.length() ; i++) {
    if(s.charAt(i)=='a'){
    System.out.println("ii="+i);
    break;}
    }


    // *****
    for (int i=0 ; i <5 ; i++){
        System.out.print("*");
    }
    System.out.println();

    for (int i=0 ; i<5 ; i++){
        for(int j=0 ; j<5 ; j++){
        System.out.print("*");
        }
        System.out.println();
    }

    for(int i=0 ; i<5 ; i++){
        for(int j=i+1 ; j<5 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    //*
    //**
    //***
    //****
    //***
    //**
    //*
    

 }
}
