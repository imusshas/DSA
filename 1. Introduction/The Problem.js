// Problem Statement: Write a program that takes an array & a key as input and prints the key if it is found.

// Data Structure 👇
const studentsDatabase = ["jordan", "erick", "john", "michel"];

// Algorithm for finding a specific user
const findStudent = (allStudents, studentName) => {
  for (let i = 0; i < allStudents.length; i++) {
    if (allStudents[i] === studentName) {
      console.log(`Found ${studentName}`);
    }
  }
};

findStudent(studentsDatabase, "erick"); ``