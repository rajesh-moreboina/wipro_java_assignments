import React from "react";

const TempleList = () => {
  const temples = [
    { 
      id: 1, 
      name: "Tirupati Temple", 
      location: "Tirupati", 
      deities: ["Venkateswara", "Padmavathi"] 
    },
    { 
      id: 2, 
      name: "Meenakshi Temple", 
      location: "Madurai", 
      deities: ["Meenakshi", "Sundareswarar"] 
    },
    { 
      id: 3, 
      name: "Golden Temple", 
      location: "Amritsar", 
      deities: ["Guru Nanak"] 
    }
  ];

  return (
    <div>
      <h2>Temple List</h2>
      <table border="1" cellPadding="8" cellSpacing="0">
        <thead>
          <tr>
            <th>Temple Name</th>
            <th>Location</th>
            <th>Deities</th>
          </tr>
        </thead>
        <tbody>
          {temples.map((temple) => (
            <tr key={temple.id}>
              <td>{temple.name}</td>
              <td>{temple.location}</td>
              <td>
                <ul>
                  {temple.deities.map((deity, index) => (
                    <li key={index}>{deity}</li>
                  ))}
                </ul>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default TempleList;
