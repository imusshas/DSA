function twoSum(array, target) {
  for (let i = 0; i < array.length - 1; i++) {
    for (let j = i + 1; j < array.length; j++) {
      if (array[i] + array[j] === target) {
        return [i, j];
      }
    }
  }

  return [];
}

const result = twoSum([2, 11, 7, 15], 9);
console.log(result);