function insertionSort(arr) {
  for (let i = 1; i < arr.length; i++) {
    //go thrugh the elemtnts behind the curent element and placed the current elements in the current place.
    for (let j = i - 1; j >= 0; j--) {
      if (arr[j + 1] < arr[j]) {
        [arr[j + 1], arr[j]] = [arr[j], arr[j + 1]];
      }
    }
  }

  return arr;
}

var arr = [23, 1, 10, 5, 2];


console.log(insertionSort(arr));
