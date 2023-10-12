const input=prompt("Enter numbers separated by one space:");
const Array = input.split(' ').map(Number);
  Array.sort(function(a, b) 
  { return b-a; });
console.log("descending order: " + Array.join(' '));
