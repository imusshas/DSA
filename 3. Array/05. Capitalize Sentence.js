function capitalizeSentence(sentence) {
  let array = sentence.toLowerCase().split(" ");
  // console.log(array);

  let capitalArray = []
  array.forEach(element => {
    capitalArray.push(element[0].toUpperCase() + element.substring(1));

  });
  let capitalStr = capitalArray.join(" ");

  return capitalStr;
}

console.log(capitalizeSentence("i aM mUHIB"));
console.log(capitalizeSentence("i am muhib"));

const capitalSentence = sentence => sentence
  .toLowerCase()
  .split(" ")
  .map(word => word[0].toUpperCase() + word.slice(1))
  .join(" ");

console.log(capitalSentence("i aM mUHIB"));