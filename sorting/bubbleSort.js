//bubble sort

function bubbleSort(arr) {
  var alreadySorted = true;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] > arr[i + 1]) {
      alreadySorted = false;
    }

    if (alreadySorted == true) {
      console.log(alreadySorted);
      return arr;
    }
  }

  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; j < arr.length - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        // var temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;

        [arr[j + 1], arr[j]] = [arr[j], arr[j + 1]];
      }
    }
  }
  return arr;
}

var arr = [64, 34, 25, 12, 22, 11, 90];
console.log(bubbleSort(arr));
