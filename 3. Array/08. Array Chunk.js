const chunk = (array, size) => {
  const chunkedArray = [];
  let index = 0;

  while (index < array.length) {
    const chunk = array.slice(index, index + size);
    chunkedArray.push(chunk);
    index += size;
  }

  return chunkedArray;
}


console.log(chunk([], 1));