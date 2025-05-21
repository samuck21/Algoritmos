function translator(word) {
  const Alphabet = [
    ["a", "b", "c", "d", "e"],
    ["4", "I3", "[", ")", "3"],
  ];
  let traduction;
  let sizeWord = word.length;
  for (var i = 0; i < sizeWord; i++) {
    let letter = word.charAt(i);
    for (var j = 0; j < 5; j++) {
      if (letter == Alphabet[0][j]) {
        traduction += Alphabet[1][j];
      }
    }
  }

  return traduction;
}
console.log(translator("abbcd"));
