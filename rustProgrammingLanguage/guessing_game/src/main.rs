use std::io;
use std::cmp::Ordering;
use rand::Rng;
fn main(){
    
    println!("Guess the number!");
    let secret_number = rand::thread_rng().gen_range(1..101);
    // println!("The secret number is: {}", secret_number);
    // println!("Please input your guess.");

    /* let创建变量,在变量名前加mut可以让它变得可用。变量默认是不可变的。mut让变量可变。
    String 是一个标准库提供的字符串类型，它是 UTF-8 编码的可增长文本块。
     :: 语法表明 new 是 String 类型的一个关联函数。关联函数（associated function）是实现一种特定类型的函数。
    let 常量
    let mut 变量
    */

    loop{
        println!("Please input your guess.");
        let mut guess = String::new();
        io::stdin().read_line(&mut guess)
        .expect("Failed to read line");

        let guess :u32 = match guess.trim().parse() {
            Ok(num) => num,
            Err(_) => continue,
        };
        println!("You guessed: {}", guess);

        match guess.cmp(&secret_number) {
            Ordering::Less => println!("Too small!"),
            Ordering::Greater => println!("Too big!"),
            Ordering::Equal => {
                println!("You win!");
                break;
        }
    }
}
    // io::stdin().read_line(&mut guess).expect("Failed to read line");
    // println!("You guessed: {}", guess);
}