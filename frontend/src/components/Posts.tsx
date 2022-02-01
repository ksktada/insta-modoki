import React from 'react';
import Photo from './Photo';

function Posts(photoList: Array<string>) {
    return (
        <ul>
            {photoList.map((photoData: string, i: number) => (
                <Photo photoData={photoData}></Photo>
            ))}
        </ul>
    )
}

export default Posts;