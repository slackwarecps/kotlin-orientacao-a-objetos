fun main(){
 print("Bem vindo xuxu!")

 val titular:String = "Fabio" //imutavel
 val numeroConta: Int = 1000
 var saldo: Double = 0.0 //mutavel


 saldo = 100 + 2.0
 saldo = saldo + 200
 saldo = 10.0


 println("Titular  $titular")
 println("Saldo  $saldo")

 when {
     saldo>0.0 ->    println("conta é positiva")

     saldo ==0.0 ->println("conta é neutra")

     else ->      println("conta é negativa")

 }



}
