class MyArray {
  constructor() {
    this.length = 0;
    this.data = {};
  }

  push(item) {
    this.data[this.length] = item;
    this.length++;
    return this.length;
  }

  pop() {
    if (this.length != 0) {
      this.length--;
      delete this.data[this.length];
    }
    return this.length;
  }

  get(index) {
    return this.data[index];
  }

  shift() {
    const firstItem = this.data[0];

    for (let i = 0; i < this.length - 1; i++) {
      this.data[i] = this.data[i + 1];

    }
    // delete this.data[this.length - 1];

    if (this.length > 0) {
      this.length--;
    }
    return firstItem;
  }

  delete(index) {
    const deletedItem = this.data[index];
    if (this.length >= 0 && index < this.length) {
      for (let i = index; i < this.length - 1; i++) {
        this.data[i] = this.data[i + 1];
      }

      delete this.data[this.length - 1];

      if (this.length > 0) {
        this.length--;
      }
    }
    return deletedItem;
  }
}

const myNewArray = new MyArray();

// console.log(myNewArray);

myNewArray.push(89);
myNewArray.push(13);
myNewArray.push("Muhib");
myNewArray.push("Nasiat");

// console.log(myNewArray.get(0));

myNewArray.pop();
myNewArray.pop();
myNewArray.pop();
myNewArray.pop();
myNewArray.pop();
// console.log(myNewArray);

myNewArray.push("Apple");
myNewArray.push("Mango");
myNewArray.push("Banana");
myNewArray.shift();
// console.log(myNewArray);

myNewArray.push("Apple");
myNewArray.delete(1);
myNewArray.delete(1);
myNewArray.delete(0);
console.log(myNewArray);