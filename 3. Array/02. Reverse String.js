function reverseString(str) {
  let len = str.length;
  let reverse = str.split("");
  for (i = 0; i < len / 2; i++) {
    let temp = reverse[i];
    reverse[i] = reverse[len - 1 - i];
    reverse[len - 1 - i] = temp;
  }

  return reverse.join("");
}

console.log(reverseString("Hello"));

const reverseStr = (str) => str.split("").reverse().join("");
console.log(reverseStr("String"));