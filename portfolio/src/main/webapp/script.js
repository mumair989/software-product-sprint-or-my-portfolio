// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * Adds a random greeting to the page.
 */
function addRandomGreeting() {
  const greetings =
      ['I am from Pakistan', 'I can speak four languages', 'I know JavaScript, java and c++, but I am also learning them'];

  // Pick a random greeting.
  const greeting = greetings[Math.floor(Math.random() * greetings.length)];

  // Add it to the page.
  const greetingContainer = document.getElementById('greeting-container');
  greetingContainer.innerText = greeting;
  
}
async function showServerTime() {
    const responseFromServer = await fetch('/hello');
    const textFromResponse = await responseFromServer.text();
  
    const dateContainer = document.getElementById('date-container');
    dateContainer.innerText = textFromResponse;
  }
  
  async function showServerInfo() {
    const responseFromServer = await fetch('/formHandler');
    const textFromResponse = await responseFromServer.text();
  
    const dateContainer = document.getElementById('information');
    dateContainer.innerText = textFromResponse;
  }

  
  function moveToContact(){
    var element = document.getElementById("lastContainer");
    element.scrollIntoView({behavior: "smooth"});

}
function moveToEducation(){
    var element = document.getElementById("projects");
    element.scrollIntoView({behavior: "smooth"});
}

function moveToExperience(){
    var element = document.getElementById("workBox");
    element.scrollIntoView({behavior: "smooth"});
}
