function reverseInteger(number) {
  let reverse = [];

  let sign = -1;

  if (number < 0) {
    number *= sign;
  } else {
    sign = 1;
  }

  while (number > 0) {
    reverse.push(number % 10);
    number = Math.floor(number / 10);
  }

  let reverseNum = 0;

  for (let i = 0; i < reverse.length; i++) {
    reverseNum += reverse[i] * (10 ** (reverse.length - 1 - i));
  }

  if (sign === -1) {
    reverseNum *= sign;
  }

  return reverseNum;
}

console.log(reverseInteger(123));
console.log(reverseInteger(-123));

const reverseInt = num => parseInt(num.toString().split("").reverse().join("")) * Math.sign(num);

console.log(reverseInt(123));
console.log(reverseInt(-123));