const array = [10, 5, 80, 25, 1];

// Define a custom comparator function.
function compare(a, b) {
  return b - a;
}

// Sort the array using the custom comparator function.
array.sort(compare);

// Print the sorted array.
console.log(array);
