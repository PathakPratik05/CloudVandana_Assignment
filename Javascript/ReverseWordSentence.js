const Sentance = "This is sunny day";
const reversedSentence = reverseSentance(Sentance);
console.log(reversedSentence);

function reverseSentance(longSentance)
{
    let runningWord = '';
    let actualRevercedSentance = '';

    for (let i = 0; i < longSentance.length; i++){

        const char = longSentance[i];

        if (char === ' ') {
            actualRevercedSentance = actualRevercedSentance + reverseCurrentWord(runningWord);
            runningWord = '';
            // words.push("1");
            actualRevercedSentance = actualRevercedSentance + " ";
        }
        else {
            runningWord = runningWord + char;
        }
        // for last word
        if (i == longSentance.length - 1) {
            actualRevercedSentance = actualRevercedSentance + reverseCurrentWord(runningWord);
        }
    }
    return actualRevercedSentance;
}

function reverseCurrentWord(word) {
    let reversingRunningWord = '';
    for (let i = word.length - 1; i >= 0; i--){
        reversingRunningWord = reversingRunningWord + word[i];
    }
    return reversingRunningWord;
}