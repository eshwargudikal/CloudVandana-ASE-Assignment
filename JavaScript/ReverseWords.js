
function reverseWords(sentence)
 {
    const words=sentence.split(' ');
    const reversedWords = words.map(word => {
      return word.split('').reverse().join('');});
    const reversedSentence=reversedWords.join(' ');
    return reversedSentence;
  }
  const inputSentence=prompt("Enter a sentence:");
  if (inputSentence!=null) 
  {
    const reversedSentence=reverseWords(inputSentence);
    console.log("Reversed Sentence:",reversedSentence);
  } 
  else 
  {
    console.log("No input provided");
  }
  
