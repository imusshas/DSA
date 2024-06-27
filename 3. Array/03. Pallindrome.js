function isPalindrome(str) {
  for (let index = 0; index < str.length; index++) {
    if (str[str.length - 1 - index] !== str[index]) {
      return false;
    }
  }

  return true;
}

console.log(isPalindrome("Abcd"));
console.log(isPalindrome("abcba"));

const checkPalindrome = str => str.split("").reverse().join("") === str;
console.log(checkPalindrome("abba"));
console.log(checkPalindrome("abcd"));