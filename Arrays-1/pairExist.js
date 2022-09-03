/*
    *problem statement: Given N array elements, check if a pair [i, j] exists such that a[i]+a[j]=k and i!=j
    *approach/logic: BF: Iterate array for each element and check if = K, TC=O(N2)
    *optimized approach: Observe that we calculated sum twice for each elements, skip where i<j
    TC=O(N2)
 */

    input = [0, 1, 2, 3];
    length = input.length;
    k=5;

    function isPairExists (array) {
        for (i=0;i<length;i++) {
            for (j=i+1; j<length;j++) {
                if (array[i]+array[j]===k) {
                    return true; // console.log('pair', input[i], input[j] );
                }
            }
        }
        return false;
    }

    console.log('is pair exist?', isPairExists(input));


