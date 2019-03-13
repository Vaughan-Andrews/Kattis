import java.util.*


fun main(args : Array<String>){
    acms()

}

fun acms(){
    val stdin = Scanner(System.`in`)
    val map = HashMap<String,kotlin.Int>()
    var count = 0
    var right = 0
    while(true){
        val tmp = stdin.nextLine().split(" ")
        if(tmp[0].equals("-1")) break
        if(tmp[2].equals("right")) {

            if(map.containsKey(tmp[1])){
                count+= map.get(tmp[1])!!
                count += Integer.parseInt(tmp[0]);
            }else{
                count += Integer.parseInt(tmp[0])
            }
            right++;
        }else{
            if(map.containsKey(tmp[1])){
                val add = 20;
                map.put(tmp[1],map.get(tmp[1])!! + add)
            }else{
                map.put(tmp[1], 20);
            }
        }
    }
    print(right.toString() + " ")
    println(count);
}