const array = [10, 2, 38, 14, 5];
console.log(array);
const descendingSortedArray = SortingDescendigArray(array);
console.log(descendingSortedArray);

function SortingDescendigArray(arr) {

    for (let i = 0; i < arr.length-1; i++){
        for (let j = i+1; j < arr.length; j++)
            if (arr[i] < arr[j])
            {
                let temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
    }

    return arr;
    
}
