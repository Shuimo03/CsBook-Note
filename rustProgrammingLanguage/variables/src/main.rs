fn main(){

    let mut s1 = String::from("hello");
     let mut len =  first_word(&mut s1);
     println!({}len);
}

fn first_word(s: &String) -> usize {
    let bytes = s.as_bytes();

    for (i, &item) in bytes.iter().enumerate() {
        if item == b' ' {
            return i;
        }
    }

    s.len()
}