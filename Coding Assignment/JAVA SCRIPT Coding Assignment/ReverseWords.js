function reverseWords(sentence) {
    // Split the input sentence into an array of words
    let words = sentence.split(' ');

    // Initialize an array to store the reversed words
    let reversedWords = [];

    // Loop through each word in the array
    for (let i = 0; i < words.length; i++) {
        let word = words[i];
        let reversedWord = '';

        // Loop through each character in the word, starting from the last character
        for (let j = word.length - 1; j >= 0; j--) {
            reversedWord += word[j]; // Build the reversed word character by character
        }

        // Add the reversed word to the array of reversed words
        reversedWords.push(reversedWord);
    }

    // Join the array of reversed words back into a sentence
    let reversedSentence = reversedWords.join(' ');

    // Return the final reversed sentence
    return reversedSentence;
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence);