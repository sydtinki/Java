class linearSearch{

static int find=1;
static int[] numbs={1,3,4,1,8,1,7};

public static void main(String args[]){

String sentence=find+" found at index: ";
int count=0;

for(int i=0; i<numbs.length; i++){

 if(numbs[i]==find){ count++;

 System.out.print(sentence+i+"\n");

}

 if(count>0){ sentence=" and :";

}

}

}

}