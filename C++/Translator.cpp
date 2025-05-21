#include <iostream>
#include <string>

using namespace std;
string  translator(string word){
 char Alphabet[3][6]={
    {'a','b','c','d','e'},
    {'4','8','(',']','E'}
    };
 int sizeWord = word.length();
 string traduction = "";
 for (int i = 0; i < sizeWord;i++)
 {
     char  letter = word[i];
     for (int j = 0; j < 5; j++)
     {
      if(letter==Alphabet[0][j]){
          traduction += Alphabet[1][j];
      }
 }
 }
 return traduction;
}
int main(){
    string mes = translator("abc");
    std::cout << mes<< std::endl;
    return 0;

}

