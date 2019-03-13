import java.util.*

fun main(args: Array<String>){
    var stdin = Scanner(System.`in`);
    var num = stdin.nextInt();
    if(num == 1){
        println(9)
    }else{
        var tmp = 9.0;
        var boxes= 4.0;
        var output =0.0;
        for(i in 0 until num-1){
            boxes = boxes * 4
            tmp = boxes + tmp;
        }
        println(boxes+tmp-boxes)
    }

}