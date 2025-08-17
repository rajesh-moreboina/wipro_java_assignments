import React from 'react';
import ServiceCard from './ServiceCard';

const TailorShop = () => {
  const services = [
    {
      serviceName: 'Shirts',
      price: 500,
      fabricsAvailable: ['Cotton', 'Linen', 'Silk']
    },
    {
      serviceName: 'Pants',
      price: 700,
      fabricsAvailable: ['Denim', 'Cotton', 'Polyester']
    },
    {
      serviceName: 'Lehenga',
      price: 2500,
      fabricsAvailable: ['Silk', 'Georgette', 'Chiffon']
    },
    {
      serviceName: 'Blouse',
      price: 1200,
      fabricsAvailable: ['Cotton', 'Silk', 'Velvet']
    }
  ];

  return (
    <div className="container mt-5">
      <h2 className="mb-4 text-center">Tailoring Services</h2>
      <div className="row">
        {services.map((service, index) => (
          <ServiceCard key={index} service={service} />
        ))}
      </div>
    </div>
  );
};

export default TailorShop;
