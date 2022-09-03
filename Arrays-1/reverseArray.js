/*
    *problem statement: reverse array, SC=O(1)
    *observations: swap by front and rear at a time till reach mid element(i>j or j<i)
    *approach: TC= O(N)
 */

input = [0, 1, 2, 3];
length = input.length;

function reverse(array) {
    i=0;
    j=length-1;
    while (i<j) {
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        console.log(array[i]);
        i++;
        j--;
    }
    return array;
}
console.log('reversed array', reverse(input));