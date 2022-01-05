function selectionSort(arr) {
  for (let i = 0; i < arr.length; i++) {
    let min = i;
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[j] < arr[min]) {
        min = j;
      }
    }
    if (min !== i) {
      [arr[i], arr[min]] = [arr[min], arr[i]];
    }
    console.log(`after ${i+1} th pass,Arr is ${arr}`);
  }
  return arr;
}

let arr = [10, 9, 8, 3, 2, 5, 4, 7];
console.log(selectionSort(arr));
