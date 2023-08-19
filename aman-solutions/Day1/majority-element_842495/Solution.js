
/* Declare and implement your function here 
eg: function example(parameter_name1,parameter_name2....){}
Handle the input/output from main()
*/




process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
input_stdin += data;
});

process.stdin.on('end', function () {
input_stdin_array = input_stdin.split("\n");
main();    
});

function readLine() {
return input_stdin_array[input_currentline++];
}


function main() {

    /* Read your input here 
    eg: For string variables:   let str = String(readLine()); 
        For int variables: let var_name = parseInt(readLine());
        For arrays : const arr = readLine().replace(/\s+$/g, '').split(' ');
    */

    /*
    Call your function with the input/parameters read above
    eg: let x = example(var_name, arr);
    */

   /*
   Log your output here 
   eg: console.log(x);
   */
let testcases = parseInt(readLine());
    while (testcases-- > 0) {
        let arraysize = parseInt(readLine());
        let majoritytime = Math.floor((arraysize/2));

        let arr = readLine().replace(/\s+$/g, '').split(' ');

        let freq = {}, repeating;
        for (let i = 0; i < arraysize; i++) {
            let number = arr[i];
            if (freq[number] != undefined) {
                freq[number]++;
                repeating = number;
            }
            else
                freq[number] = 1;
        }
        let number = -1;
        Object.keys(freq).forEach((value) => {
            if (freq[value] > majoritytime
                && number == -1)
                number = value;
        })
        console.log(number)
    }
}