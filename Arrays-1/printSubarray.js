/**
 * simple sub array problems
 * print sub array
 * Tc=O(N3)
 */

function printSubArray(array) {
    for (i=0;i<array.length;i++) {
        for (j=i;j<array.length;j++) {
            for (k=i;k<=j;k++) {
                console.log(array[k]);
            }
            console.log("  ");
        }
    }
}

function reverseSubArray(i, j, array) {
    while(i<j) {
        let temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    return array;
}

printSubArray([0,1,2,3]);
console.log("reverse output", reverseSubArray(2,4,[0,1,2,3,4,5]));