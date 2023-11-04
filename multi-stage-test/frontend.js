// Import necessary modules
const express = require('express');
const app = express();

// Serve static files
app.use(express.static('public'));

// Start the server
app.listen(3000, function () {
  console.log('Front-end app listening on port 3000!');
});